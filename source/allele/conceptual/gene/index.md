---
title: Gene
description: A genomic region identified by a collection of alternately spliced ReferenceTranscriptSequences, given a name by one or more naming agencies.

---

Scope and Usage
---------------

Included under this definition of gene are:

+ Protein coding genes
+ Pseudogenes
+ Non-Coding RNA sequences
+ Computationally Predicted Genes

There is no guarantee that a gene is ever transcribed, such as in some computationally predicted genes or pseudogenes.   Furthermore, many genes are untranslated.

The assignment of names, and the association of [TranscriptReferenceSequences](/allele/conceptual/reference_sequence/transcript_reference_sequence.html) must be performed by a recognized public group such as NCBI or HGNC.  Note that different agencies may be responsible for names and for associations with sequences.

Conceptual Model
----------------

![Gene](/images/GeneConceptual.svg)

Resource Model: [Gene](/allele/resource/gene/index.html#resource_model)

Exclusions and Limitations
--------------------------

The Identifiers in Gene are used to track the symbols granted by agencies such as HGNC.  However, the long-form name is not similarly tracked.  Instead a single name is chosen for the Gene, and that name is not guaranteed to either be fixed over time, or to be chosen from one of the names provided by an agency.

Attributes
----------

{:.table}
| Attribute Name | Attribute Type |
|---------------|---------------|
| identifier     | Identifier[] |
| symbol | String |
| name           | String |
| aliasSymbol    | String[] |

The identifier attribute contains an array of Identifier entities. Each Identifier is given for each symbol granted to the gene by a naming entity.  If a naming agency withdraws a name, the period attribute of the Identifier is given a end value of the date of withdrawl.  This signifies that the Identifier is not valid.

symbol: The human-readable symbol for the gene used in the implementing system.  Note that this symbol is not fixed; the implementing system may change the symbol of a particular gene.  Typically, the symbol for a gene will be one of the symbols granted by a naming agency.  The implementing system should be consistent, and chose a naming agency from which to pick symbols.  At any given time, an officialSymbol should be unique in the implemeting system.

name: The human-readable name for a gene.  Note that the name is not fixed; the implementing system may change the name of a particular gene.  Typically, the name for a gene will be one of the names granted by a naming agency.  The implemeting system should be consistent, and chose a single naming agency from which to pick symbols.

aliasSymbol: A list of Strings that contain other symbols that may or may have been used to refer to this gene.  A useful set of values would include symbols from identifiers other than the one chosen for officialSymbol, as well as any previous values of officialSymbol used in the implementing system.  There is no guarantee that an alias symbol will not be an aliasSymbol or officialSymbol of another gene.

Related Entities
----------------

{:.table}
| Relation Name | Entity Type | Cardinality |
|---------------|-------------|-------------|
| hasTranscript | [TranscriptReferenceSequence](/allele/conceptual/reference_sequence/transcript_reference_sequence.html) | 1..* |
| hasGeneSequence | [GeneReferenceSequence](/allele/conceptual/reference_sequence/gene_reference_sequence.html) | 0..* |

hasTranscript:   Each gene must have at least one transcript; it may have more than one because of alternate splicing or different transcripts being created by differing groups such as NCBI and Ensembl.

hasGeneSequence:  Each gene may have an associated gene sequence, such as those from LRG or RefSeqGene
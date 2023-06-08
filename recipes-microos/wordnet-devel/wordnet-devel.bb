SUMMARY = "The development libraries and header files for WordNet"
DESCRIPTION = "WordNet is a large lexical database of English. \
Nouns, verbs, adjectives and adverbs are grouped into sets \
of cognitive synonyms (synsets), each expressing a distinct concept. Synsets \
are interlinked by means of conceptual-semantic and lexical relations. The \
resulting network of meaningfully related words and concepts can be navigated \
with the browser. \
WordNet's structure makes it a useful tool for computational linguistics and \
natural language processing. \
 \
This package contains the libraries and header files required to create \
applications based on WordNet."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "wordnet-devel-3.0-35.1.aarch64.rpm"
RPM_HASH = "ee5c8777cfeb337f8414921d426f0d5c56e5a5f15189bd8b3e1979e596123acc61dfbf52b03f69ca6884c32ecced9a449d55ae9778b920561dcd91ae88b0117e"

RPROVIDES:${PN} += "wordnet-devel wordnet-devel(aarch-64)"
RDEPENDS:${PN} += "libWN3 tcl-devel tk-devel"

inherit rpm

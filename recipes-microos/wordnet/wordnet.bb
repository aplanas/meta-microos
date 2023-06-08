SUMMARY = "A lexical database for the English language"
DESCRIPTION = "WordNet is a large lexical database of English. \
Nouns, verbs, adjectives and adverbs are grouped into sets \
of cognitive synonyms (synsets), each expressing a distinct concept. Synsets \
are interlinked by means of conceptual-semantic and lexical relations. The \
resulting network of meaningfully related words and concepts can be navigated \
with the browser. \
WordNet's structure makes it a useful tool for computational linguistics and \
natural language processing."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "wordnet-3.0-35.1.aarch64.rpm"
RPM_HASH = "99281984fd34ecba412b0f8c8b773e65d2a5710533d2f49552fc32c0dcec12c1eca0ab7bbe82a18481144b4eca4706d5c6053be2e550730081e5c29843e575f1"

RPROVIDES:${PN} += "wordnet wordnet(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libWN.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit) tcl tk"

inherit rpm

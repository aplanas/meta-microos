SUMMARY = "The Japanese Dictionary from the EDRDG project (JMdict format)"
DESCRIPTION = "JMdict/EDICT is a machine-readable multilingual Japanese dictionary. \
It contains Japanese–English translations for over 180000 entries, \
representing more than 205000 unique headword–reading combinations. \
 \
The dictionary is made available in different formats. This package \
contains the XML variant of: \
 \
* the JMdict project's word dictionary ('JMdict' file) \
* the KANJIDIC project's Kanji dictionary (covering JIS 0208/0212/0213; \
  'kanjidic2.xml' file)"
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "20230411"

RPM_NAME = "jmdict-20230411-1.1.noarch.rpm"
RPM_HASH = "57860a97000c5d58083dc09ffa6eb398af356f1e93040823be9bcc9bd95d2347b9aa4efb7993ddd5eeeeaa2ba329c3e19bcef68d8daa5dc1d9302cc3e1d70d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdict locale(ja)"
RDEPENDS:${PN} += ""

inherit rpm

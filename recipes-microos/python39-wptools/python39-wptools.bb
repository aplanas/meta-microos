SUMMARY = "Wikipedia tools (for Humans)"
DESCRIPTION = "Python and command-line MediaWiki access for Humans. \
 \
Features: \
* get an HTML or plain text 'extract' (lead or summary) \
* get a representative image (pageimage, thumb, etc.) \
* get an Infobox as a python dictionary \
* get any/all Wikidata by title \
* get info in any language \
* get random info"
LICENSE = "MIT"

PV = "0.4.17"

RPM_NAME = "python39-wptools-0.4.17-4.17.noarch.rpm"
RPM_HASH = "2ff2c5d74ed5de363ee489909e607293cf9ece3feba4fe67213987b71ef5904236da5621737d0a272ab0b2127c6eecf24c2c1ad4a2c34bd669ade7bdd64cd5f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wptools) python39-wptools python3dist(wptools)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-certifi python39-html2text python39-lxml python39-pycurl update-alternatives"

inherit rpm

SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "python39-tldextract-3.4.0-1.4.noarch.rpm"
RPM_HASH = "9b72012e629b25ba2ec64c8519ef62abe4de47fd7caa0a35064c960ab5cf39b5e09844ce61260bf97e9ae2260c58d9b3368b7c5e7fa831e0ad4623ae7e04c38a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tldextract) python39-tldextract python3dist(tldextract)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-filelock python39-idna python39-requests python39-requests-file python39-setuptools update-alternatives"

inherit rpm

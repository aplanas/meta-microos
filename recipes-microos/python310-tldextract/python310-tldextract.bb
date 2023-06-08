SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "python310-tldextract-3.4.0-1.4.noarch.rpm"
RPM_HASH = "bc9c2d0ee1bb344482e6c6d8fc67cc6fcd4e25022823c3f2fb4499990324c51dd18015d2fec385305fce443bca9e95ccd9b6d517f1b2fdcb47968ab13b9eac06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tldextract python3.10dist(tldextract) python310-tldextract python3dist(tldextract)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-filelock python310-idna python310-requests python310-requests-file python310-setuptools update-alternatives"

inherit rpm

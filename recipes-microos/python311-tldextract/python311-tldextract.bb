SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "python311-tldextract-3.4.0-1.4.noarch.rpm"
RPM_HASH = "c09fe6b039856cde9dec39d5abfa4223c14f045ac28fac2ade321affdab12db0a5b9ca508c63aa664e608aba8e0f34e1ccdcebd16b583bcaf70ddd0ca8082613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tldextract) python311-tldextract python3dist(tldextract)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-filelock python311-idna python311-requests python311-requests-file python311-setuptools update-alternatives"

inherit rpm

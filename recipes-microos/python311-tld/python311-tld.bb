SUMMARY = "URL top level domain (TLD) extraction module"
DESCRIPTION = "This module extracts the top level domain (TLD) from the URL given. \
A list of TLD names is taken from Mozillas public suffix list: \
<https://publicsuffix.org/list/effective_tld_names.dat>"
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.12.6"

RPM_NAME = "python311-tld-0.12.6-2.5.noarch.rpm"
RPM_HASH = "ee0253aadc2fc3dc774f4abf858f8b59510e45e6740f8daa43787124885f806023ff30490107e13af7efcbfb14979796b2fecb1926a99be7a7e133dbe6aa4cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tld) \
python311-tld \
python3dist(tld)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm

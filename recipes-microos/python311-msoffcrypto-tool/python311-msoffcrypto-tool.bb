SUMMARY = "Library for decrypting MS Office files"
DESCRIPTION = "A Python tool and library for decrypting MS Office \
files with passwords or other keys."
LICENSE = "MIT"

PV = "4.10.2"

RPM_NAME = "python311-msoffcrypto-tool-4.10.2-3.14.noarch.rpm"
RPM_HASH = "e34da563072a1167debf686325fee8b037415227bcb4f75ee036de3b84cdcd3d1f1de92b2f31436d5f25ed0cd70537a2a53c61b55ca4c1bd62152fef581d35ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(msoffcrypto-tool) \
python311-msoffcrypto-tool \
python3dist(msoffcrypto-tool)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-cryptography \
python311-olefile \
python311-setuptools \
update-alternatives"

inherit rpm

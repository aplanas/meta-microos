SUMMARY = "SSH public key parser"
DESCRIPTION = "OpenSSH Public Key Parser for Python"
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python39-sshpubkeys-3.3.1-1.8.noarch.rpm"
RPM_HASH = "606148e63a5861deff397d99992a7277f197adb778cd612a56d4e68d953d0ef28f03428bbe9a072d27983fe8da0cae594133aba367ee17aa85a36205b986efde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sshpubkeys) python39-sshpubkeys python3dist(sshpubkeys)"
RDEPENDS:${PN} += "python(abi) python39-cryptography python39-ecdsa"

inherit rpm

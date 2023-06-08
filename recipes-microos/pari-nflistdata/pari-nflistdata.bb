SUMMARY = "Data files for the 'nflist' program from PARI"
DESCRIPTION = "This package contains fields of small discriminant (currently needed \
by the single Galois groups A5 and A5(6)) or to list regular \
extensions of Q(T) in degree 7 to 15, using `nflist` from the PARI \
CAS."
LICENSE = "GPL-2.0-or-later"

PV = "20220729"

RPM_NAME = "pari-nflistdata-20220729-1.2.noarch.rpm"
RPM_HASH = "c0215a071c8f16950fe465d04b4ccba974995aa38f70e9e065abe360534eb1a738bb099a54e83012c5002947433a9d45e88feb60abe8922fc2748cde141deaa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-nflistdata"
RDEPENDS:${PN} += ""

inherit rpm

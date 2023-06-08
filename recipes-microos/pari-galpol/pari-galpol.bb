SUMMARY = "GALPOL polynomial database for the PARI CAS"
DESCRIPTION = "PARI package of the GALPOL database of polynomials defining Galois \
extensions of the rationals, accessed by the 'galoisgetpol' function."
LICENSE = "GPL-2.0-or-later"

PV = "20180625"

RPM_NAME = "pari-galpol-20180625-3.3.noarch.rpm"
RPM_HASH = "1a0351c60e9ac43005ce152768429ca39dc04f5f5e8d26a300bff9d401a2388aae4c68207d6383d62b10790a158a02c75f3f36997f64badba2760880a7a21411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-galpol"
RDEPENDS:${PN} += ""

inherit rpm

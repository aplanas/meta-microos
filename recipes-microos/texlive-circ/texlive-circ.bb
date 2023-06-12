SUMMARY = "Macros for typesetting circuit diagrams"
DESCRIPTION = "Several electrical symbols like resistor, capacitor, \
transistors etc., are defined. The symbols can be connected \
with wires. The package also contains an American resistor \
symbol for those of us on that side of the Atlantic. The \
package also has simple facilities for producing optics \
diagrams; however, no-one would deny that the PSTricks \
pst-optic package, or the MetaPost makecirc package do the job \
better."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn62977"

RPM_NAME = "texlive-circ-2023.201.1.1svn62977-53.1.noarch.rpm"
RPM_HASH = "15f680f77721a0d776429ddf31e70c3916c01a3e747e3c6b368ab67b9e13bb97bc3313d28eaca29e3bec0c847c95e0aeee3d0335d0b2adc40313b515387d14e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(basic.def) \
tex(box.def) \
tex(cioptic.tfm) \
tex(circ.sty) \
tex(gate.def) \
tex(ic.def) \
tex(oldgate.def) \
tex(optics.def) \
tex(physics.def) \
texlive-circ"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

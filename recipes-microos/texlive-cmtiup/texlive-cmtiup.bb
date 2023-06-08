SUMMARY = "Upright punctuation with CM italic"
DESCRIPTION = "The cmtiup fonts address a problem with the appearance of \
punctuation in italic text in mathematical documents. To \
achieve this, all punctuation characters are upright, and \
kerning between letters and punctuation is adjusted to allow \
for the italic correction. The fonts are implemented as a set \
of vf files; a package for support in LaTeX 2e is provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn39728"

RPM_NAME = "texlive-cmtiup-2023.201.2.1svn39728-53.1.noarch.rpm"
RPM_HASH = "7c018be7c5cec5901cc668c49609124664707aacfa7a89861613cf369e7950a0b92198b268b05cd17f718da358db69c179aeb3ade1b4c557a3395130d5e9e2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmbxtiup10.tfm) tex(cmbxtiup10.vf) tex(cmtiup.sty) tex(cmtiup10.tfm) tex(cmtiup10.vf) tex(cmtiup12.tfm) tex(cmtiup12.vf) tex(cmtiup7.tfm) tex(cmtiup7.vf) tex(cmtiup8.tfm) tex(cmtiup8.vf) tex(cmtiup9.tfm) tex(cmtiup9.vf) tex(ecbiup0500.tfm) tex(ecbiup0500.vf) tex(ecbiup0600.tfm) tex(ecbiup0600.vf) tex(ecbiup0700.tfm) tex(ecbiup0700.vf) tex(ecbiup0800.tfm) tex(ecbiup0800.vf) tex(ecbiup0900.tfm) tex(ecbiup0900.vf) tex(ecbiup1000.tfm) tex(ecbiup1000.vf) tex(ecbiup1095.tfm) tex(ecbiup1095.vf) tex(ecbiup1200.tfm) tex(ecbiup1200.vf) tex(ecbiup1440.tfm) tex(ecbiup1440.vf) tex(ecbiup1728.tfm) tex(ecbiup1728.vf) tex(ecbiup2074.tfm) tex(ecbiup2074.vf) tex(ecbiup2488.tfm) tex(ecbiup2488.vf) tex(ecbiup2986.tfm) tex(ecbiup2986.vf) tex(ecbiup3583.tfm) tex(ecbiup3583.vf) tex(ectiup0500.tfm) tex(ectiup0500.vf) tex(ectiup0600.tfm) tex(ectiup0600.vf) tex(ectiup0700.tfm) tex(ectiup0700.vf) tex(ectiup0800.tfm) tex(ectiup0800.vf) tex(ectiup0900.tfm) tex(ectiup0900.vf) tex(ectiup1000.tfm) tex(ectiup1000.vf) tex(ectiup1095.tfm) tex(ectiup1095.vf) tex(ectiup1200.tfm) tex(ectiup1200.vf) tex(ectiup1440.tfm) tex(ectiup1440.vf) tex(ectiup1728.tfm) tex(ectiup1728.vf) tex(ectiup2074.tfm) tex(ectiup2074.vf) tex(ectiup2488.tfm) tex(ectiup2488.vf) tex(ectiup2986.tfm) tex(ectiup2986.vf) tex(ectiup3583.tfm) tex(ectiup3583.vf) texlive-cmtiup"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(cmbx10.tfm) tex(cmbxti10.tfm) tex(cmr10.tfm) tex(cmr12.tfm) tex(cmr7.tfm) tex(cmr8.tfm) tex(cmr9.tfm) tex(cmti10.tfm) tex(cmti12.tfm) tex(cmti7.tfm) tex(cmti8.tfm) tex(cmti9.tfm) tex(ecbi0500.tfm) tex(ecbi0600.tfm) tex(ecbi0700.tfm) tex(ecbi0800.tfm) tex(ecbi0900.tfm) tex(ecbi1000.tfm) tex(ecbi1095.tfm) tex(ecbi1200.tfm) tex(ecbi1440.tfm) tex(ecbi1728.tfm) tex(ecbi2074.tfm) tex(ecbi2488.tfm) tex(ecbi2986.tfm) tex(ecbi3583.tfm) tex(ecbx0500.tfm) tex(ecbx0600.tfm) tex(ecbx0700.tfm) tex(ecbx0800.tfm) tex(ecbx0900.tfm) tex(ecbx1000.tfm) tex(ecbx1095.tfm) tex(ecbx1200.tfm) tex(ecbx1440.tfm) tex(ecbx1728.tfm) tex(ecbx2074.tfm) tex(ecbx2488.tfm) tex(ecbx2986.tfm) tex(ecbx3583.tfm) tex(ecrm0500.tfm) tex(ecrm0600.tfm) tex(ecrm0700.tfm) tex(ecrm0800.tfm) tex(ecrm0900.tfm) tex(ecrm1000.tfm) tex(ecrm1095.tfm) tex(ecrm1200.tfm) tex(ecrm1440.tfm) tex(ecrm1728.tfm) tex(ecrm2074.tfm) tex(ecrm2488.tfm) tex(ecrm2986.tfm) tex(ecrm3583.tfm) tex(ecti0500.tfm) tex(ecti0600.tfm) tex(ecti0700.tfm) tex(ecti0800.tfm) tex(ecti0900.tfm) tex(ecti1000.tfm) tex(ecti1095.tfm) tex(ecti1200.tfm) tex(ecti1440.tfm) tex(ecti1728.tfm) tex(ecti2074.tfm) tex(ecti2488.tfm) tex(ecti2986.tfm) tex(ecti3583.tfm) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

SUMMARY = "A package to help change page layout parameters in LaTeX"
DESCRIPTION = "The package lets you change page layout parameters in small \
steps over a range of values using options. It can set \
\\textwidth appropriately for the main fount, and ensure that \
the text fits inside the printable area of a printer. An \
rmpage-formatted document can be typeset identically without \
rmpage after a single cut and paste operation. Local \
configuration can set defaults: for all documents; and by \
class, by printer, and by paper size. The geometry package is \
better if you want to set page layout parameters to particular \
measurements."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.92svn54080"

RPM_NAME = "texlive-rmpage-2023.201.0.0.92svn54080-53.1.noarch.rpm"
RPM_HASH = "0b45748f86563264be034a52ccf427513a5f919994b25981b4cdc4845c1c7829778637b9b5e7d0f4b9ce6573b9f39f4dce8b3d85eab9ed5b6f53e622ebab6f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rmpage.sty) tex(rmpgen.cfg) texlive-rmpage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(avant.sty) tex(beton.sty) tex(bookman.sty) tex(chancery.sty) tex(helvet.sty) tex(newcent.sty) tex(palatino.sty) tex(times.sty) tex(utopia.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

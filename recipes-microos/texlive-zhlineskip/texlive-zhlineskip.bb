SUMMARY = "Line spacing for CJK documents"
DESCRIPTION = "This package supports typesetting CJK documents. It allows \
users to specify the two ratios between the leading and the \
font size of the body text and the footnote text. For CJK \
typesetting, these ratios usually range from 1.5 to 1.67. This \
package is also capable of restoring the math leading to that \
of the Latin text (usually 1.2 times the font size). Finally, \
it is possible to achieve the Microsoft Word multiple line \
spacing style using zhlineskip."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-2023.201.1.0esvn51142-52.1.noarch.rpm"
RPM_HASH = "0d0e78c0a5347b343e769f1908b0647b1aa29254a4b68001e17456bbad4be250521e0745c4a9c10632499b4c24657eb055a03ef419cdeda718115887fd8ccb5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zhlineskip.sty) texlive-zhlineskip"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(kvoptions.sty) tex(mathtools.sty) tex(xintexpr.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

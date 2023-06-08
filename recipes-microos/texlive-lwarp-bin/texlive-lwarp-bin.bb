SUMMARY = "Binary files of lwarp"
DESCRIPTION = "Binary files of lwarp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43292"

RPM_NAME = "texlive-lwarp-bin-2023.20230311.svn43292-89.1.aarch64.rpm"
RPM_HASH = "c84433b73fd837116e181bb9105a42d90b2992d46e8fe19adb3ded336d84a5eb14c3d62bfc3b575e7165750cf90dcf7ec2716c844aef6a306b3a1fa1da63919c"

RPROVIDES:${PN} += "texlive-lwarp-bin texlive-lwarp-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-lwarp"

inherit rpm

SUMMARY = "Binary files of texlogfilter"
DESCRIPTION = "Binary files of texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61780"

RPM_NAME = "texlive-texlogfilter-bin-2023.20230311.svn61780-89.1.aarch64.rpm"
RPM_HASH = "b7e0d22e0aab8133705d32efc069533cef788c64d6f70f3bbc00393310d2527719ede220d587e3ff1cc054902ab3cc6ad9d0507060ba3683b6568f7bc1a845d3"

RPROVIDES:${PN} += "texlive-texlogfilter-bin texlive-texlogfilter-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texlogfilter"

inherit rpm

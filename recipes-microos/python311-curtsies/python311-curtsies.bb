SUMMARY = "Curses-like terminal wrapper, with colored strings!"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-curtsies-0.4.1-1.3.noarch.rpm"
RPM_HASH = "a60881cc718e4524a3c02f892bdb2e8e13447114746d4c4973d26f91f2b3c7ea94a14e5bd6cdcf677e53ffb494143492bb433f4273c19cd16326a7582bdc51a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(curtsies) python311-curtsies python3dist(curtsies)"
RDEPENDS:${PN} += "python(abi) python311-blessed python311-cwcwidth"

inherit rpm

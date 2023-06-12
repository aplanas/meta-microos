SUMMARY = "Curses-like terminal wrapper, with colored strings!"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-curtsies-0.4.1-1.3.noarch.rpm"
RPM_HASH = "0be13e50ed08406ebd95a997697b9362bff0daed125f00a88e09db31a192f9bd326e93bd163e569ec7b6e3298c7108784ee445c4d99815cbb66f1f882e4d63ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(curtsies) \
python39-curtsies \
python3dist(curtsies)"
RDEPENDS:${PN} += "python(abi) \
python39-blessed \
python39-cwcwidth"

inherit rpm

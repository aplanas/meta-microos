SUMMARY = "Curses-like terminal wrapper, with colored strings!"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-curtsies-0.4.1-1.3.noarch.rpm"
RPM_HASH = "ac4f7e5c0fe9b52cbbecf8986a49b420da4cd904a5a2d138fc94acaa037d4eaad0766c09330059d9fc257ac97a2da879a606f3965be7fdab5196692b9d7ad64f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-curtsies python3.10dist(curtsies) python310-curtsies python3dist(curtsies)"
RDEPENDS:${PN} += "python(abi) python310-blessed python310-cwcwidth"

inherit rpm

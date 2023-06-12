SUMMARY = "Helper that makes writing ZYpp plugins easier"
DESCRIPTION = "This API allows writing ZYpp plugins by just subclassing from a python class \
and implementing the commands you want to respond to as python methods."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "python311-zypp-plugin-0.6.3-4.21.noarch.rpm"
RPM_HASH = "562d2785c1b369d0305dbd6e33e696afa24badc7e459946df13c1a22a8c06d69bd67a1bf73f7e4cc4adeb78245b4c1d7ec42bcff1d1753decc52b2aa6094c75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-zypp-plugin"
RDEPENDS:${PN} += "python(abi) \
python311-base"

inherit rpm

SUMMARY = "An in-process file monitor"
DESCRIPTION = "Hupper is an integrated process monitor that will track changes to any \
imported Python files in sys.modules as well as custom paths. \
When files are changed the process is restarted."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "python311-hupper-1.10.3-1.4.noarch.rpm"
RPM_HASH = "e676565a064048f13e7054d1988a697d9b1afa8c618d157b4e61359d8ac2a3083d9783ac6e670f0313ea6a3b5a750c34dc89b8fc87383202951787126562833c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hupper) \
python311-hupper \
python3dist(hupper)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-watchdog \
update-alternatives"

inherit rpm

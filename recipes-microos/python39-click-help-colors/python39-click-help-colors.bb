SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-click-help-colors-0.9.1-2.1.noarch.rpm"
RPM_HASH = "b391d4919053d13f0663ce2cbd8ad0aeed6a15136ba55e806257fd994589a7d0f0a3674fa24d761483dd23cc708ea5ea0f3aeaecd8fb943245192de7c2da78a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-help-colors) \
python39-click-help-colors \
python3dist(click-help-colors)"
RDEPENDS:${PN} += "python(abi) \
python39-click"

inherit rpm

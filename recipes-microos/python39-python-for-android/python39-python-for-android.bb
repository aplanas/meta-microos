SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2023.2.10"

RPM_NAME = "python39-python-for-android-2023.2.10-1.1.noarch.rpm"
RPM_HASH = "7f24bb54e47a3fcdca4c45c79fb8046bd3e18949067283bc0d305e8928f09c1cafe1601039117cf6d63df4bb583b0e10c5840b8724aa441b23c5ec8400e1126c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-for-android) \
python39-python-for-android \
python3dist(python-for-android)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3.9 \
python(abi) \
python39-Jinja2 \
python39-appdirs \
python39-build \
python39-colorama \
python39-toml \
update-alternatives"

inherit rpm

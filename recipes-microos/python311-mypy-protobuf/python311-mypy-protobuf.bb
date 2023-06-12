SUMMARY = "Generate mypy stub files from protobuf specs"
DESCRIPTION = "Generate mypy stub files from protobuf specs."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-mypy-protobuf-3.2.0-1.13.noarch.rpm"
RPM_HASH = "0b0980da4af241a2b8b34af8dae6b5f7a1a8905354a2eca24b128b18a42226eeb80a3c9ce9dfde608ee6401165d3a9960df5ced64607ec18793529b6b82648e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mypy-protobuf) \
python311-mypy-protobuf \
python3dist(mypy-protobuf)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-protobuf \
update-alternatives"

inherit rpm

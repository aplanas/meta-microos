SUMMARY = "Python API for TP-Link Kasa Smarthome products"
DESCRIPTION = "This package contains the python module for interfacing with TP-Link smart devices: Plugs, Power Strips, Wall switches and bulbs. \
Use 'kasa' binary."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "python311-kasa-0.5.1-1.3.noarch.rpm"
RPM_HASH = "cb36e3f64db10c8c6207d5f7279fe1182788cb85c7b87cef93fe86ad558c4c92a6a1114485e4fe1d904ea9a4e419e12aae973409dee9e46a6b1feb35842e8aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-kasa) \
python311-kasa \
python3dist(python-kasa)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-anyio \
python311-asyncclick \
python311-pydantic \
python311-setuptools \
python311-voluptuous \
python311-xdoctest \
update-alternatives"

inherit rpm

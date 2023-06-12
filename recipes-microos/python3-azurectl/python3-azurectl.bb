SUMMARY = "Command Line Interface to manage Microsoft Azure services"
DESCRIPTION = "Management tool for the Microsoft Azure public cloud service. \
It allows uploading, registering and maintaining OS images for \
multiple Azure Account Subscriptions."
LICENSE = "Apache-2.0"

PV = "3.0.4"

RPM_NAME = "python3-azurectl-3.0.4-1.15.noarch.rpm"
RPM_HASH = "a9a6d365f4fafa2636db8cb79f238a81b235cc6047c3f2deb711127a1c46780991893ee7f8da96396d211d423192e6518171a679505bc1e5e2a5e1fd3a7d19b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-azurectl) \
python-azurectl \
python3-azurectl \
python3.10dist(azurectl) \
python3dist(azurectl)"
RDEPENDS:${PN} += "/usr/bin/python3 \
man \
openssl \
python(abi) \
python3-APScheduler \
python3-azure-servicemanagement-legacy \
python3-azure-storage \
python3-cryptography \
python3-docopt \
python3-pyOpenSSL \
python3-python-dateutil \
python3-setuptools"

inherit rpm

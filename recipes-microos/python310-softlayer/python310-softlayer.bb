SUMMARY = "A set of Python libraries that assist in calling the SoftLayer API"
DESCRIPTION = "This library provides a simple Python client to interact with SoftLayer's XML-RPC API."
LICENSE = "MIT"

PV = "6.1.4"

RPM_NAME = "python310-softlayer-6.1.4-1.3.aarch64.rpm"
RPM_HASH = "efd74c8b811b48a6cde31545c6c74a1ffa90e863df7baf405b1ad531f72b24c2d55d868d838e735544abf918fc92ca2f46b4a9608f1d78f95f04b58af03b5968"

RPROVIDES:${PN} += "python3-softlayer \
python3.10dist(softlayer) \
python310-softlayer \
python310-softlayer(aarch-64) \
python3dist(softlayer)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
python310-prettytable \
python310-prompt_toolkit \
python310-pygments \
python310-requests \
python310-rich \
python310-setuptools \
python310-softlayer-zeep \
python310-typing_extensions \
python310-urllib3 \
update-alternatives"

inherit rpm

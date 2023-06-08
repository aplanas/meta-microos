SUMMARY = "The RPC framework and message specification for Rigetti QCS"
DESCRIPTION = "The RPC framework and message specification for Rigetti QCS."
LICENSE = "Apache-2.0"

PV = "3.10.0"

RPM_NAME = "python311-rpcq-3.10.0-1.4.noarch.rpm"
RPM_HASH = "9994b3a856fcd4f97bcbe774f772ba4fcf5818c8f036d4b83fbc38edbb87b959d1adffed4c2620d9c37cd4cbfdcb01cc134df676ed679cdca0c81f2b610d0a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rpcq) python311-rpcq python3dist(rpcq)"
RDEPENDS:${PN} += "python(abi) python311-msgpack python311-python-rapidjson python311-pyzmq python311-ruamel.yaml"

inherit rpm

SUMMARY = "The RPC framework and message specification for Rigetti QCS"
DESCRIPTION = "The RPC framework and message specification for Rigetti QCS."
LICENSE = "Apache-2.0"

PV = "3.10.0"

RPM_NAME = "python310-rpcq-3.10.0-1.4.noarch.rpm"
RPM_HASH = "59f1e94190d582225b95043c95fffd2f005349e134a3dfb595affb8af5b1bfe2c44500f92c8499cb3410df57e9021b5f1eef085d7a26c7ac2d5478de4343d2be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpcq python3.10dist(rpcq) python310-rpcq python3dist(rpcq)"
RDEPENDS:${PN} += "python(abi) python310-msgpack python310-python-rapidjson python310-pyzmq python310-ruamel.yaml"

inherit rpm

SUMMARY = "Multi key dictionary implementation"
DESCRIPTION = "Multi-key dict provides also extended interface for iterating over items and \
keys (e.g. by the key type), which might be useful when creating, e.g. \
dictionaries with index-name key pair allowing to iterate over items using \
either: names or indexes. \
It can be useful for many many other similar use-cases, and there is no limit \
to the number of keys used to map to the value."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python311-multi_key_dict-2.0.3-4.16.noarch.rpm"
RPM_HASH = "465b7cd2903839ef1fc5e3d1d82e459bda8137b6ac46e756257d9114067a138be2c0e80ad728a59c993df25b580b39dc6f77f78189fff7bfbcaa9ff1546e368e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(multi-key-dict) python311-multi_key_dict python3dist(multi-key-dict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

SUMMARY = "Multi key dictionary implementation"
DESCRIPTION = "Multi-key dict provides also extended interface for iterating over items and \
keys (e.g. by the key type), which might be useful when creating, e.g. \
dictionaries with index-name key pair allowing to iterate over items using \
either: names or indexes. \
It can be useful for many many other similar use-cases, and there is no limit \
to the number of keys used to map to the value."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "python39-multi_key_dict-2.0.3-4.16.noarch.rpm"
RPM_HASH = "29442773cbf7cac359bc0ed16387c5155bbde6e31641839f5e5c77ad8e1a7f50b6d68399313f92d56b18c402e145f28eafa148c1e26c9b302aaa817d808bb115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(multi-key-dict) \
python39-multi_key_dict \
python3dist(multi-key-dict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

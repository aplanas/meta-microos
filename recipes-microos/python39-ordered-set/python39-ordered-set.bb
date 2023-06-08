SUMMARY = "Custom MutableSet that remembers its order"
DESCRIPTION = "An OrderedSet is a custom MutableSet that remembers its order, so that every \
entry has an index that can be looked up."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-ordered-set-4.1.0-1.3.noarch.rpm"
RPM_HASH = "978cd69f91f23a4861c6e97d3bcd4f8bda5e0c4b66835d10899f82091cd74d98ffa3cc2f11905d6f0981e5f76154079e5021fcc87be1fe98ee11ac0e0e765c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ordered-set) python39-ordered-set python3dist(ordered-set)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

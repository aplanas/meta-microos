SUMMARY = "dict-like structures for Python"
DESCRIPTION = "cooldict provides some dict-like structures for Python, such as \
* a write-through cache around another dict \
* a finalizable dict \
* a branching dict \
* a copy-on-write dict (with and without sinkholing capability)"
LICENSE = "BSD-2-Clause"

PV = "1.04"

RPM_NAME = "python311-cooldict-1.04-1.14.noarch.rpm"
RPM_HASH = "33b697133777ff280b985751941bd374280dcdd840c7005bc91e8d14a33fe452951f8a204ed648501bc1b9c8f7a25c2b820d20aa2dd3f2b3526a5162018cde1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cooldict) \
python311-cooldict \
python3dist(cooldict)"
RDEPENDS:${PN} += "python(abi) \
python311-ana"

inherit rpm

SUMMARY = "File-based locks for Python"
DESCRIPTION = "Locket implements a lock that can be used by multiple processes provided \
they use the same path. \
 \
Locks largely behave as (non-reentrant) `Lock` instances from the `threading` \
module in the standard library. Specifically, their behaviour is: \
 \
* Locks are uniquely identified by the file being locked, \
  both in the same process and across different processes. \
* Locks are either in a locked or unlocked state. \
* When the lock is unlocked, calling `acquire()` returns immediately and changes \
  the lock state to locked. \
* When the lock is locked, calling `acquire()` will block until the lock state \
  changes to unlocked, or until the timeout expires. \
* If a process holds a lock, any thread in that process can call `release()` to \
  change the state to unlocked. \
* Behaviour of locks after `fork` is undefined."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python39-locket-1.0.0-1.4.noarch.rpm"
RPM_HASH = "23c0165741dfa61a7d01fad080e960804828a5b7a585ee3fde8973007ab28383bd64d05cb24a9b551e0a017696a2f435000035221fe83788ac8fe270b29bd776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(locket) python39-locket python3dist(locket)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

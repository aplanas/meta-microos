SUMMARY = "Python Actor concurrency library"
DESCRIPTION = "Thespian is a Python library providing a framework for developing \
concurrent, distributed, fault tolerant applications. \
 \
Thespian is built on the Actor Model which allows applications to be \
written as a group of independently executing but cooperating \
'Actors' which communicate via messages.  These Actors run within \
the Actor System provided by the Thespian library. \
 \
      * Concurrent \
      * Distributed \
      * Fault Tolerant \
      * Scalable \
      * Location independent \
 \
Actor programming is broadly applicable and it is ideally suited \
for Cloud-based applications as well, where compute nodes are \
added and removed from the environment dynamically. \
 \
   * More Information: http://thespianpy.com \
   * Release Notes: http://thespianpy.com/doc/releases.html"
LICENSE = "MIT"

PV = "3.10.6"

RPM_NAME = "python311-thespian-3.10.6-1.3.noarch.rpm"
RPM_HASH = "a34bb2018f43fb1adf98cd3a754d2e5047a692555fd32b8d4c6543eedf422722fa74d15c0f6fca1b3b1a3b40a48b21e2b71443765725ec98491f4944cfeb04c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(thespian) \
python311-thespian \
python3dist(thespian)"
RDEPENDS:${PN} += "python(abi) \
python311-setproctitle"

inherit rpm

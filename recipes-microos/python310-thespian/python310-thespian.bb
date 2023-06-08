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

RPM_NAME = "python310-thespian-3.10.6-1.3.noarch.rpm"
RPM_HASH = "dae0822ce505376e090b2581bacfe6eb6fcf76ac9678ed5ce1e4c1585c8f4e1cce16137889af355e64e111abf60db7305bec894dbd493a516a0244471237697e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-thespian python3.10dist(thespian) python310-thespian python3dist(thespian)"
RDEPENDS:${PN} += "python(abi) python310-setproctitle"

inherit rpm

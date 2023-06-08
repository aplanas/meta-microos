SUMMARY = "Java Concurrency Tools for the JVM"
DESCRIPTION = "This project aims to offer some concurrent data structures \
currently missing from the JDK: \
 \
* SPSC/MPSC/SPMC/MPMC Bounded lock free queues \
* SPSC/MPSC Unbounded lock free queues \
* Alternative interfaces for queues \
* Offheap concurrent ring buffer for ITC/IPC purposes \
* Single Writer Map/Set implementations \
* Low contention stats counters \
* Executor"
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-3.3.0-2.10.noarch.rpm"
RPM_HASH = "ab313dfaf7e5cdcecff92f0f4870e8dace3464a022b31ac4bbaee884f74914e42497ba4bc3a57f10aec97f530eb434a7cfb7d5cfb551f298884956e9e389a65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools mvn(org.jctools:jctools-core) mvn(org.jctools:jctools-core:pom:) osgi(org.jctools.core)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm

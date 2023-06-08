SUMMARY = "A heap with decrease-key and increase-key operations"
DESCRIPTION = "HeapDict implements the MutableMapping ABC, meaning it works pretty \
much like a regular Python dict.  It's designed to be used as a \
priority queue. \
 \
Unlike the Python standard library's heapq module, the HeapDict \
supports efficiently changing the priority of an existing object \
(often called 'decrease-key' in textbooks).  Altering the priority is \
important for many algorithms such as Dijkstra's Algorithm and A*."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python39-HeapDict-1.0.1-2.11.noarch.rpm"
RPM_HASH = "48ce3518984d60c74466545f11a5f5f42c4cf151eae4b1863a4063d68fcda0bbcceea2cede5b479eb4dd4e703006b84250d9dba1bac35a2065d98e8477e7cee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(heapdict) python39-HeapDict python3dist(heapdict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

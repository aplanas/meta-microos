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

RPM_NAME = "python310-HeapDict-1.0.1-2.11.noarch.rpm"
RPM_HASH = "7b9ef15f85dab7aaa239ff9213a417f861fbe2239decc02375b1861da140d2a536e9835df0b0202ac3c1d1f2718f5544de73ef13dc35bcf4417b4e4dafa9e73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-HeapDict python3.10dist(heapdict) python310-HeapDict python3dist(heapdict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

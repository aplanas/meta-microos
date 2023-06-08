SUMMARY = "Python Sorted Collections"
DESCRIPTION = "SortedCollections is an Python sorted collections library. \
 \
Features \
-------- \
 \
- ValueSortedDict - Dictionary with (key, value) item pairs sorted by value. \
- ItemSortedDict - Dictionary with key-function support for item pairs. \
- OrderedDict - Ordered dictionary with numeric indexing support. \
- OrderedSet - Ordered set with numeric indexing support. \
- IndexableDict - Dictionary with numeric indexing support. \
- IndexableSet - Set with numeric indexing support. \
- SegmentList - List with fast random access insertion and deletion."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-sortedcollections-2.1.0-1.10.noarch.rpm"
RPM_HASH = "526a751be4f7c6c97d187388ec89974097bb9b33084ddb9c782bc6ed85dc12d3d407705d048a2cca0d81fbede24dc097caa09a17da3a2fd66bcfe18fe7e907f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sortedcollections) python39-sortedcollections python3dist(sortedcollections)"
RDEPENDS:${PN} += "python(abi) python39-sortedcontainers"

inherit rpm

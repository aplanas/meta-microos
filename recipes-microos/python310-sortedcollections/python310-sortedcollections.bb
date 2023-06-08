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

RPM_NAME = "python310-sortedcollections-2.1.0-1.10.noarch.rpm"
RPM_HASH = "79ffaf0b1240ed221263ae01d39dee9891744d4f22bbae09027ba69acbef47c1c016b49ded86ce6e3bb606282461052e779e9547be81b734227c4ff02cfda148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortedcollections python3.10dist(sortedcollections) python310-sortedcollections python3dist(sortedcollections)"
RDEPENDS:${PN} += "python(abi) python310-sortedcontainers"

inherit rpm

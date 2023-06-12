SUMMARY = "Spill-to-disk dictionary for Python"
DESCRIPTION = "A dictionary that spills to disk. \
Chest acts like a dictionary, but it can write its contents to disk. \
This is useful in the following two occasions: \
1. Chest can hold datasets that are larger than memory \
2. Chest persists and so can be saved and loaded for later use"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python310-chest-0.2.3-4.6.noarch.rpm"
RPM_HASH = "a691f1084cbc7aebf11876fced5af78e6037066996ff109535c3e43ed07f3fccd0b1a90f9b8188f56cc6bc53e03446e34bf924c0fe261276f8112443c2de1084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chest \
python3.10dist(chest) \
python310-chest \
python3dist(chest)"
RDEPENDS:${PN} += "python(abi) \
python310-HeapDict"

inherit rpm

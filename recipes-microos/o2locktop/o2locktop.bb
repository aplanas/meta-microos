SUMMARY = "A top-like OCFS2 DLM lock monitor"
DESCRIPTION = "o2locktop is a top-like OCFS2 DLM lock monitor, it displays DLM lock \
usages via querying OCFS2 file system statistics from the specified \
nodes. \
 \
You can utilize o2locktop to detect the hot files/directories, whose \
DLM locks are frequently referenced among the cluster. \
 \
You can get the maximal wait time per DLM lock, this helps you \
identify which hot files/directories should be decoupled for \
improving file access performance."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10+git.1564463799.6f331ba"

RPM_NAME = "o2locktop-1.0.10+git.1564463799.6f331ba-2.10.noarch.rpm"
RPM_HASH = "c69958e68dfe8c7b5a1572105e8191f15e4b863426426baedc09b933f2f529fd2e0b0091259be8b7ed55b16deac58038b068071348f0c133b01d498fed0bdbc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "o2locktop"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3"

inherit rpm

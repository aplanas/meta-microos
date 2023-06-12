SUMMARY = "Python cocoapi"
DESCRIPTION = "COCO is a large image dataset designed for object detection, segmentation, \
person keypoints detection, stuff segmentation, and caption generation. \
This package provides Matlab, Python, and Lua APIs that assists in loading, \
parsing, and visualizing the annotations in COCO."
LICENSE = "BSD-2-Clause"

PV = "2.0~post.1582219528.8c9bcc3"

RPM_NAME = "python39-pycocotools-2.0~post.1582219528.8c9bcc3-2.12.aarch64.rpm"
RPM_HASH = "e8edbf172e7f949d0f58b8a703d163df8b8ae05c73df11422ae6d07a1d76a6afff744c86545690b9a969de486059375234c8e2bb6c3f491a5cd2c5fbeafd05c1"

RPROVIDES:${PN} += "python3.9dist(pycocotools) \
python39-cocotools \
python39-pycocotools \
python39-pycocotools(aarch-64) \
python3dist(pycocotools)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-Cython \
python39-matplotlib \
python39-setuptools"

inherit rpm

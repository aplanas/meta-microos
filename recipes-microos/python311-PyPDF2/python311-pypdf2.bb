SUMMARY = "PDF toolkit"
DESCRIPTION = "A Pure-Python library built as a PDF toolkit.  It is capable of: \
 \
- extracting document information (title, author, ...), \
- splitting documents page by page, \
- merging documents page by page, \
- cropping pages, \
- merging multiple pages into a single page, \
- encrypting and decrypting PDF files. \
 \
By being Pure-Python, it should run on any Python platform without any \
dependencies on external libraries.  It can also work entirely on StringIO \
objects rather than file streams, allowing for PDF manipulation in memory. \
It is therefore a useful tool for websites that manage or manipulate PDFs."
LICENSE = "BSD-3-Clause"

PV = "2.11.1"

RPM_NAME = "python311-PyPDF2-2.11.1-1.3.noarch.rpm"
RPM_HASH = "34a34ac3fc2c956824937f62c643f6e5650537cc3c3c806c668d38d1791a071775d4e46f3a5f6b8c7a5e8bb97a47005ffc2373a3501a56c0c0a3699fd18eaa85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypdf2) python311-PyPDF2 python3dist(pypdf2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

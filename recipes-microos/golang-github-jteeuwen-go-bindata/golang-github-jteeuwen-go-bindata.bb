SUMMARY = "A small utility which generates Go code from any file"
DESCRIPTION = "This package converts any file into manageable Go source code. Useful for embedding binary data into a go program. The file data is optionally gzip compressed before being converted to a raw byte slice. \
 \
It comes with a command line tool in the go-bindata sub directory. This tool offers a set of command line options, used to customize the output being generated."
LICENSE = "CC0-1.0"

PV = "3.0.7+git20151023.72.a0ff256"

RPM_NAME = "golang-github-jteeuwen-go-bindata-3.0.7+git20151023.72.a0ff256-5.11.aarch64.rpm"
RPM_HASH = "d2a1e357c388d9c1b8aba139b02b1c4f2cccac24a08096e4fc08f6f64f76c99b3499a41e7e64c7dbcfa1c1baca9121a7b7ad528a4cea573f235e0dd5f80d6b38"

RPROVIDES:${PN} += "go-bindata golang(github.com/jteeuwen/go-bindata) golang-github-jteeuwen-go-bindata golang-github-jteeuwen-go-bindata(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

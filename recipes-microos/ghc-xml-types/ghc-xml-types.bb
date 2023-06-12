SUMMARY = "Basic types for representing XML"
DESCRIPTION = "Basic types for representing XML. \
 \
The idea is to have a full set of appropriate types, which various XML \
libraries can share. Instead of having equivalent-but-incompatible types for \
every binding, parser, or client, they all share the same types can can thus \
interoperate easily. \
 \
This library contains complete types for most parts of an XML document, \
including the prologue, node tree, and doctype. Some basic combinators are \
included for common tasks, including traversing the node tree and filtering \
children."
LICENSE = "MIT"

PV = "0.3.8"

RPM_NAME = "ghc-xml-types-0.3.8-4.2.aarch64.rpm"
RPM_HASH = "6c5e280a76735beafd10242049171a5139b3071918acc48a482a954d23fd295c9061e9e72d7b6fdea08e5ec866153e8ccd41b22937cdac1f27711facea679fcc"

RPROVIDES:${PN} += "ghc-xml-types \
ghc-xml-types(aarch-64) \
libHSxml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm

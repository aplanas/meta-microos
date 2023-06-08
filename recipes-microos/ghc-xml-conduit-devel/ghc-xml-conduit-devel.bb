SUMMARY = "Haskell xml-conduit library development files"
DESCRIPTION = "This package provides the Haskell xml-conduit library development files."
LICENSE = "MIT"

PV = "1.9.1.2"

RPM_NAME = "ghc-xml-conduit-devel-1.9.1.2-1.4.aarch64.rpm"
RPM_HASH = "f3f3785f5a1be8ccdb32982b525c637bc88ae02b3ef501026b67080503dc5a67019a29c54bc9d5f21b88fef17751fea1f4abad8160529c73527ad204e5b86615"

RPROVIDES:${PN} += "ghc-devel(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) ghc-xml-conduit-devel ghc-xml-conduit-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) ghc-devel(base-4.17.1.0) ghc-devel(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR) ghc-devel(blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc) ghc-devel(bytestring-0.11.4.0) ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-devel(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) ghc-devel(containers-0.6.7) ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) ghc-devel(deepseq-1.4.8.0) ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-devel(text-2.0.2) ghc-devel(transformers-0.5.6.2) ghc-devel(xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb) ghc-xml-conduit"

inherit rpm

SUMMARY = "Haskell xml-conduit profiling library"
DESCRIPTION = "This package provides the Haskell xml-conduit profiling library."
LICENSE = "MIT"

PV = "1.9.1.2"

RPM_NAME = "ghc-xml-conduit-prof-1.9.1.2-1.4.aarch64.rpm"
RPM_HASH = "593ad0656992849854310615c276534e72843e1ea24f9d6965f0d7bacf992923c330c0c44913ce6c480073e25584005bf13ab862809c3a507c322b0fc8f0e692"

RPROVIDES:${PN} += "ghc-prof(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) ghc-xml-conduit-prof ghc-xml-conduit-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) ghc-prof(base-4.17.1.0) ghc-prof(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR) ghc-prof(blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc) ghc-prof(bytestring-0.11.4.0) ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-prof(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) ghc-prof(containers-0.6.7) ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) ghc-prof(deepseq-1.4.8.0) ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2) ghc-prof(xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb) ghc-xml-conduit-devel"

inherit rpm

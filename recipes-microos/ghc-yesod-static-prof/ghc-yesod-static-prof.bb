SUMMARY = "Haskell yesod-static profiling library"
DESCRIPTION = "This package provides the Haskell yesod-static profiling library."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-prof-1.6.1.0-4.4.aarch64.rpm"
RPM_HASH = "df2a4b31bf83c806543411d1383cfadb35a72f2f50c67f000ebf136439188a26dd5abfa056b395d31d207fe617f941df01b7b6d3cd86ce71e0231a818020726a"

RPROVIDES:${PN} += "ghc-prof(yesod-static-1.6.1.0-DEqPHy4hggrCzWSPgCKUoY) ghc-yesod-static-prof ghc-yesod-static-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) ghc-prof(base-4.17.1.0) ghc-prof(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) ghc-prof(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) ghc-prof(bytestring-0.11.4.0) ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-prof(containers-0.6.7) ghc-prof(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) ghc-prof(cryptonite-conduit-0.2.2-Ic5yZAN3MwnLmQgFse4azZ) ghc-prof(css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs) ghc-prof(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) ghc-prof(directory-1.3.7.1) ghc-prof(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) ghc-prof(filepath-1.4.2.2) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-prof(hjsmin-0.2.1-G11T0ofJtyz5gQQf6GRgL1) ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) ghc-prof(mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm) ghc-prof(process-1.6.16.0) ghc-prof(template-haskell-2.19.0.0) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) ghc-prof(wai-app-static-3.1.7.4-9UpsDZD9lQf3J0Cj3szLw2) ghc-prof(yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG) ghc-yesod-static-devel"

inherit rpm

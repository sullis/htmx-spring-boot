package io.github.wimdeblauwe.htmx.spring.boot.mvc;

/**
 * Enum representing the response headers used by htmx.
 *
 * @see <a href="https://htmx.org/reference/#response_headers">Response Headers Reference</a>
 */
public enum HtmxResponseHeader {
    /**
     * Pushes a new url into the history stack.
     *
     * @see <a href="https://htmx.org/reference/#response_headers">HX-Push</a>
     */
    HX_PUSH_URL("HX-Push-Url"),
    /**
     * Can be used to do a client-side redirect to a new location.
     *
     * @see <a href="https://htmx.org/reference/#response_headers">HX-Redirect</a>
     */
    HX_REDIRECT("HX-Redirect"),
    /**
     * Can be used to do a full refresh of the page on the client-side.
     *
     * @see <a href="https://htmx.org/reference/#response_headers">HX-Refresh</a>
     */
    HX_REFRESH("HX-Refresh"),
    /**
     * A CSS selector that updates the target of the content update to a different element on the page.
     *
     * @see <a href="https://htmx.org/reference/#response_headers">HX-Retarget</a>
     */
    HX_RETARGET("HX-Retarget"),
    /**
     * Can be used to trigger client side events.
     *
     * @see <a href="https://htmx.org/headers/hx-trigger/">HX-Trigger</a>
     */
    HX_TRIGGER("HX-Trigger"),
    /**
     * Can be used to trigger client side events after the <a href="https://htmx.org/docs/#request-operations></a>settling step</a>.
     *
     * @see <a href="https://htmx.org/headers/hx-trigger/">HX-Trigger-After-Settle</a>
     */
    HX_TRIGGER_AFTER_SETTLE("HX-Trigger-After-Settle"),
    /**
     * Can be used to trigger client side events after the <a href="https://htmx.org/docs/#request-operations">swap step</a>.
     *
     * @see <a href="https://htmx.org/headers/hx-trigger/">HX-Trigger-After-Settle</a>
     */
    HX_TRIGGER_AFTER_SWAP("HX-Trigger-After-Swap"),
    /**
     * Allows you to specify how the response will be swapped.
     *
     * @see <a href="https://htmx.org/reference/#response_headers">HX-Reswap</a>
     */
    HX_RESWAP("HX-Reswap");

    private final String value;

    HtmxResponseHeader(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

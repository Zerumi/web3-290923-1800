function send_intersection_rq(x,y,r) {
    drawPoint(x, y, r);

    // send request

    // redraw point by result
    const urlParams =
        new URLSearchParams({"x-select": x, "y-select": y, "r-select": r});
    window.location = ctx + "/controller?" + urlParams.toString();
}